/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jairo;

/**
 *
 * @author Jairo
 */  
    // incrementar dias ok
    // incrementar mes ok
    // incrementar año ok 
    // mostrar la fecha ok
    // metodo comprobacion superar 31 dias = aumentar 1 mes ok


class Calendario {
    
    int dia, mes, anio;
    
    Calendario(){       // constructor default FECHA ACTUAL: 21/04/2023
        this.dia = 12;
        this.mes = 5;
        this.anio = 2023;
    }    
    Calendario(int dia, int mes, int anio){ // constructor para crear una fecha elegida por el usuario
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public int incrementarDia(){ // incrementamos dia en 1
        this.dia ++;
        comprobarDia();
        return dia;
    }
    public int incrementarMes(){ // incrementamos mes en 1
        this.mes ++;
        comprobarMes();
        return this.mes;
    }
    public int incrementarAnio(int cantidad){ // incrementamos año en funcion del usuario
        this.anio = this.anio + cantidad;
        return this.anio;
    }
    
        @Override
    public String toString(){  // mostramos todo
        
        return "Día: " + this.dia + " Mes: " + this.mes + " Año: " + this.anio;
    }

    private int comprobarMes(){    // comprobamos mes si supera 12, vuelve a 1
        switch (this.mes){
            case 12:
                this.mes = 1;
                this.anio ++;
            break;
            default:
        }
        return this.mes;
    }
      private int comprobarDia(){    // comprobamos dia si supera 12, vuelve a 1
          boolean esBisiesto = comprobarAnio();
          switch (this.mes){
              case 1:
                  if (this.dia > 31){
                      this.dia = 1;
                      this.mes ++;
                  }
              break;
              case 2:
                  
                  if (esBisiesto == true && this.dia > 29){                 // comprobacion bisiesto
                      this.dia = 1;
                      this.mes ++;
                  }else if (esBisiesto == false && this.dia > 28){
                      this.dia = 1;
                      this.mes ++;
                    }
                  
              break;
              case 3:
                   if (this.dia > 31){
                      this.dia = 1;
                      this.mes ++;
                  }
              break;
              case 4:
                   if (this.dia > 30){
                       this.dia = 1;
                       this.mes ++;
                   }
              break;
              case 5:
                   if (this.dia > 31){
                      this.dia = 1;
                      this.mes ++;
                  }
              break;
              case 6:
                  if (this.dia > 30){
                       this.dia = 1;
                       this.mes ++;
                   }
              break;
              case 7:
                   if (this.dia > 31){
                      this.dia = 1;
                      this.mes ++;
                  }
              break;
              case 8:
                   if (this.dia > 31){
                      this.dia = 1;
                      this.mes ++;
                  }
              break;
              case 9:
                  if (this.dia > 30){
                       this.dia = 1;
                       this.mes ++;
                   }
              break;
              case 10:
                   if (this.dia > 31){
                      this.dia = 1;
                      this.mes ++;
                  }
              break;
              case 11:
                  if (this.dia > 30){
                       this.dia = 1;
                       this.mes ++;
                   }
              break;
               case 12:
                    if (this.dia > 31){
                      this.dia = 1;
                      this.mes ++;
                  }
              break;
              default:
          }
          /* if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12 && this.dia > 31){
           this.dia = 15;
        }else if(this.mes == 2 && this.dia > 28){   
           this.dia = 15;
        }else if(this.mes == 4 ||this.mes == 6 ||this.mes == 9 || this.mes == 11 && dia > 30){   
           this.dia = 15;
        }*/
        return this.dia;
    }
      public boolean comprobarAnio(){  // comprobacion bisiesto
          boolean esBisiesto = false;
          if (this.anio%4 == 0){
              esBisiesto = true;
          }else{
              esBisiesto = true;
            }
          return esBisiesto;
     }
      
      
    public void iguales(Calendario comparar){
        if (this.dia == comparar.dia && this.mes == comparar.mes && this.anio == comparar.anio){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAnio(){
        return this.anio;
    }
    public int setDia(int dia){
        this.dia = dia;
        return this.dia;
    }
     public int setMes(int mes){
        this.mes = mes;
        return this.mes;
    }
      public int setAnio(int anio){
        this.anio = anio;
        return this.anio;
    }
            
}
