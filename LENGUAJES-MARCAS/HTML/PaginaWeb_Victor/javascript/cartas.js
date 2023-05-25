/* JAVASCRIPT QUE OCULTA DIV TEMPORAL Y MUESTRA EL DIV RESPECTIVO, AÑADIENDO TEXTO DENTRO DE LOS IDENTIFICADORES<*/

function mostrarTop() {
    document.getElementById('ocultarEnClic').style.display = "none";
    document.getElementById('cartas').style.display = "block";
    document.getElementById('cartaImagen').src = "./Imagenes/ornn.png";
    document.getElementById('cartaCaption').innerHTML = "<span>Ornn</span>";
    document.getElementById('cartaLore').innerHTML = "Ornn es el semidiós de Freljord de la forja y la artesanía. Trabaja en la soledad de una enorme forja esculpida en las cavernas de lava bajo el volcán de Dulcehogar. En ella modela objetos de calidad sin igual y depura menas en burbujeantes calderos de roca fundida.";
    document.getElementById('cartaRol').innerHTML = "<span>Rol:</span> Tanque";
    document.getElementById('cartaRegion').innerHTML = "<span>Region: </span>Freljord";
}
function mostrarJg() {
    document.getElementById('ocultarEnClic').style.display = "none";
    document.getElementById('cartas').style.display = "block";
    document.getElementById('cartaImagen').src = "./Imagenes/kindred.png";
    document.getElementById('cartaCaption').innerHTML = "<span>Kindred</span>";
    document.getElementById('cartaLore').innerHTML = "Divididos, pero nunca separados, Kindred representan las dos esencias de la muerte. El arco de Cordera ofrece una rápida liberación de los pesares del reino mortal a aquellos que aceptan su destino. Lobo da caza a quienes intentan escapar de él y les revela su inexorable necesidad con una dentellada de sus poderosas fauces.";
    document.getElementById('cartaRol').innerHTML = "<span>Rol:</span> Tirador";
    document.getElementById('cartaRegion').innerHTML = "<span>Region: </span>Runaterra";
}
function mostrarMid() {
    document.getElementById('ocultarEnClic').style.display = "none";
    document.getElementById('cartas').style.display = "block";
    document.getElementById('cartaImagen').src = "./Imagenes/lux.png";
    document.getElementById('cartaCaption').innerHTML = "<span>Lux</span>";
    document.getElementById('cartaLore').innerHTML = "Luxanna Crownguard procede de Demacia, un reino insular en el que las habilidades mágicas se observan con temor y suspicacia. Capaz de manipular la luz a su voluntad, creció temiendo que la descubriesen y la exiliaran, por lo que se vio obligada a mantener su poder en secreto a fin de preservar el estatus de su familia.";
    document.getElementById('cartaRol').innerHTML = "<span>Rol:</span> Mago";
    document.getElementById('cartaRegion').innerHTML = "<span>Region: </span>Demacia";
}
function mostrarAdc() {
    document.getElementById('ocultarEnClic').style.display = "none";
    document.getElementById('cartas').style.display = "block";
    document.getElementById('cartaImagen').src = "./Imagenes/seraphine.png";
    document.getElementById('cartaCaption').innerHTML = "<span>Seraphine</span>";
    document.getElementById('cartaLore').innerHTML = "Seraphine, de padres zaunitas, nació en Piltover y es capaz de escuchar las almas de los demás. El mundo le canta y ella le devuelve la canción. Aunque esos sonidos le resultaban abrumadores cuando era pequeña, ahora le sirven de inspiración, y transforma el caos en una sinfonía.";
    document.getElementById('cartaRol').innerHTML = "<span>Rol:</span> Mago";
    document.getElementById('cartaRegion').innerHTML = "<span>Region: </span>Piltover";
}
function mostrarSupp() {
    document.getElementById('ocultarEnClic').style.display = "none";
    document.getElementById('cartas').style.display = "block";
    document.getElementById('cartaImagen').src = "./Imagenes/thresh.png";
    document.getElementById('cartaCaption').innerHTML = "<span>Thresh</span>";
    document.getElementById('cartaLore').innerHTML = "Sádico y astuto, Thresh es un ambicioso e incansable espíritu de las Islas de la Sombra. Aunque una vez fue el guardián de incontables secretos arcanos, buscó un poder mayor a la vida o la muerte. Ahora se alimenta del tormento y quebranta a otros con sus lentas e insoportables torturas.";
    document.getElementById('cartaRol').innerHTML = "<span>Rol:</span> Apoyo";
    document.getElementById('cartaRegion').innerHTML = "<span>Region: </span>Islas de la Sombra";
}
/* FUNCION PARA CAMBIAR EL VOLUMEN DEL AUDIO DE FONDO,  SOLO FUNCIONA SI SE INTERACTUA VARIAS VECES EN LA PÁGINA POR POLITICAS DE LOS NAVEGADORES  */
window.onload = function() {
    var backgroundAudio=document.getElementById("musicaFondo");
    backgroundAudio.volume=0.5;
}