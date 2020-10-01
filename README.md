
    Los ataques no son clases como tal si no strings que se pasan
    No hay pruebas unitarias
    imprime por consola en vez de lanzar errores y dice que vegeta esta muerto si goku esta muerto
    b. ¿Se viola algún(os) principio(s) de diseño ? ¿Cuál(es)? 
Se viola el principio single responsability porque goku tiene mas de una razon de cambio en los metodos atacar y kaioken 
Se viola el open close en vegeta y goku por no tener los ataques como objetos lo que hace que esto sea abierto para la extension
Se viola la interfaz segregation porque vegeta depende de un metodo que no utiliza (aplicar KaiohKen)
Se viola la dependency inversion porque goku y vegeta no dependen de una abstraccion de luchador que sepa atacar

nota sobre mi codigo: Tuve que hacer un patron de facade para ataques de vegeta y goku porque hay ataques que vegeta no conoce y goku si y al reves si esto. viola
un poco el polimorfismo pero generalmente siempre hay que resignar un poco de rigides ( con respecto a los principios de diseño) en las soluciones

