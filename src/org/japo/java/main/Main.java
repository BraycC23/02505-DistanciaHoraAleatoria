/* 
Copyright 2019  Brayan C. Sanchez Arenas - brayancamilo.sanchez.alum2iescap.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Brayan C. Sanchez Arenas
 */
public class Main {
public static final Random RND = new Random();
    public static void main(String[] args) {
       
      //Constantes 
      int Hora_E = 8;
      int Min_E = 20;
      int Seg_E = 0;
      
      try{   
          //Obtencion Hora actual
          GregorianCalendar gc = new GregorianCalendar();
          int Hora_A = gc.get(Calendar.HOUR_OF_DAY);
          int Min_A = gc.get(Calendar.MINUTE);
          int Seg_A = gc.get(Calendar.SECOND);
          //Generar Hora Entrada 
          int Hora_R = RND.nextInt(Hora_A - Hora_E + 1) + Hora_E;
          int Min_R = RND.nextInt(Min_A - Min_E + 1) + Min_E;
          int Seg_R = RND.nextInt(Seg_A - Seg_E + 1) + Seg_E;
          //Paso a segundos 
          int SegundosA = Hora_A * 3600 + Min_A * 60 + Seg_A;
          int SegundosR = Hora_R * 3600 + Min_R * 60 + Seg_R;
          //Calculo Tiempo Clase
          int SegTC = SegundosA - SegundosR;
          //Paso a Minutos
          int MinTC = SegTC / 60;
          SegTC = SegTC % 60;
          //Paso a Horas
          int HoraTC = MinTC / 60;
          MinTC = MinTC % 60;
          // Generar datos
        System.out.printf("Hora actual ........: %02d/%02d/%02d%n", Hora_A, 
                Min_A, Seg_A);
        System.out.printf("Hora inicio ........: %02d/%02d/%02d%n", Hora_R, 
                Min_R, Seg_R);
        System.out.printf("Tiempo de clase ....: %02d/%02d/%02d%n", HoraTC, MinTC,
                SegTC);
          
          
          System.out.println("");
          
      } catch (Exception e){
      
      
        
    }
}}
