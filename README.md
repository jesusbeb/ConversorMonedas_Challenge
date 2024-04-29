Conversor de Monedas

Este proyecto es un Challenge o Desafío, sobre la construcción de un conversor de monedas, como parte del programa de Oracle Next Education y Alura Latam. Usando como lenguaje a Java 17 y como herramientas de apoyo se utilizo IntelliJ y Trello para la elaboración de cada paso para su construccion.

En este Conversor se consulta a una API para obtener las tasas de cambio actuales de monedas usando como base el dólar (USD). En la pantalla principal con la que interactúa el usuario se muestran algunas opciones directas para convertir entre dólares (USD), pesos mexicanos (MXN), reales brasileños (BRL) y pesos colombianos (COP). Sin embargo, también hay una opción para elegir qué tipo de monedas queremos convertir con solo ingresar el código ISO de dichas monedas. Finalmente hay una opción que muestra los códigos de estas monedas en caso de no conocerlas. Además de elegir las opciones directas disponibles o ingresar manualmente los códigos de monedas, se tiene que indicar la cantidad a convertir.

El proyecto consta de los siguientes archivos: Principal.java, ConsultaAPI.java, JsonToClass.java y Conversion.java.

El archivo Principal. java muestra al usuario el menú con el que interactúa, este se compone de un do while(), un switch() y el manejo de errores mediante try-catch cuando el usuario ingrese opciones no validas.

En el archivo ConsultaAPI.java se hace uso de la clase HttpClient para realizar solicitudes a la API. Se usa igual la clase HttpRequest para controlar los parámetros de las solicitudes y así trabajar de la manera que queremos la respuesta de la consulta. También se hace uso de la librería externa Gson para poder convertir el Json de respuesta en una clase de Java y manejarla con los métodos que el lenguaje nos proporciona.

JsonToClass es la clase a la que se convierte el Json que obtuvimos de la respuesta de la API. Es en realidad una clase Record, este tipo de clase almacena datos inmutables, genera automáticamente por detrás los getters, setters y métodos. Esta clase la definimos para que reciba del Json solo la clave llamada “conversion_rates” la cual contiene dentro de si las clave de la monedas y su valor en USD. Dicha clave “conversion_rates” la almacenamos en un Map de java.

Finalmente, la clase Conversion.java es la encargada de contener los métodos para convertir entre monedas, solicitar información al usuario e imprimir en pantalla los resultados.

El manejo del conversor de monedas por parte del usuario, es realmente sencillo, la aplicación funciona completamente y sin errores.

Autor
JesusBeb
