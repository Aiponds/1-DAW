

1) Mostrar cuántos clientes hay cuyo representante no es de Paris


select
	count(clientes.nombrecliente) as "numero de clientes que hay cuyo representante no es de Paris"
from
	clientes,empleados,oficinas
where
	clientes.codigoempleadorepventas=empleados.codigoempleado
and
	empleados.codigooficina=oficinas.codigooficina
and
	codigoempleado not in (select ciudad="paris" from oficinas);


2) De entre los clientes que vivan en una ciudad con nombre compuesto, sacar el nombre
de los que han realizado pagos por una cuantía total superior a 5000 euros.


select distinct
	clientes.nombrecliente 
from
	clientes, pagos
where 
	pagos.codigocliente=clientes.codigocliente
and
	ciudad like "% %"
and
	pagos.cantidad>5000;



 3) Muestra los 10 primeros caracteres de Lineadireccion1 y los 5 primeros caracteres de
Lineadireccion2 de las oficinas en las que hay empleados que representan a más de un
cliente


select 
	LEFT(Lineadireccion1,10), LEFT(Lineadireccion2,5), empleados.nombre
from

	clientes, empleados
where
	clientes.codigoempleadorepventas=empleados.codigoempleado
and
	codigoempleado in(select codigoempleadorepventas from clientes);




4) Mostrar el cliente que hizo el pedido de mayor cuantía, de entre los que se 
sirvieron a tiempo (fechaentrega<=fechaesperada).

Select
	clientes.nombrecliente as cliente, sum(detallepedidos.cantidad*detallepedidos.Preciounidad) as cuantia ,fechaentrega, fechaesperada
FROM
	clientes, pedidos, detallepedidos
where
	detallepedidos.codigoPedido=pedidos.codigoPedido
and 
	pedidos.codigocliente=clientes.codigocliente
and
	fechaentrega<=fechaesperada
group by pedidos.codigopedido
order by cuantia desc limit 1;