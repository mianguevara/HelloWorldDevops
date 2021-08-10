# DemoApp
 
 ## ¿Qué hace?
 
 Se construirá un servicio que aceptará solicitudes HTTP GET y POST en http: // localhost: 8080 / greeting.
 Se debe pasar un cadena name donde indica el nombre del usuario como se indica a continuacion:<br />
<pre><code>http://localhost:8080/greeting?name=User</code></pre>
 y dara como respuesta un JSON con el siguiente formato:
 {"id":1,"content":"Hello, User"}
 
 ## Probando el servicio
 
 ### 1. Pruebas de funcionalidad del servicio.
 
Ahora que el serivicio esta funcionando en http: // localhost: 8080 / greeting? name = Michell.
Observe como si se cambia el valor de name se obtiene como resultado:
<pre><code>{"id":2,"content":"Hello, Michell"}</code></pre>
también cómo el atributo id ha cambiado de 1 a 2. Esto demuestra que está trabajando con la misma instancia de GreetingController en varias solicitudes y que su campo de contador se incrementa en cada llamada como se esperaba.

 ### 2. Pruebas de la semántica REST: Métodos HTTP y códigos de respuesta.
Ya hemos probado el bloque funcional de nuestro servicio; ahora nos toca probar todo aquello que va asociado al protocolo HTTP, es decir que las invocaciones se hacen mediante los métodos HTTP aceptados y que los códigos de respuesta son los correspondientes según la petición recibida. Recordamos estos criterios:
<ul>
<li>El servicio atenderá las peticiones por GET devolviendo un HTTP Status 200 OK si se procesan correctamente.</li>
<li>El servicio atenderá las peticiones por POST devolviendo un HTTP Status 200 OK si se procesan correctamente.</li>
<li>El servicio devolverá un HTTP Status 405 Method Not Allowed, si se invoca por otro verbo HTTP a los aceptados.</li>
<li>El servicio invocado por GET espera recibir un parámetro «input» de forma obligatoria. Si no se recibe este parámetro se debe devolver un HTTP Status 400 Bad Request.</li>
<li>El servicio invocado por POST espera recibir un parámetro «input» de forma obligatoria. Si no se recibe este parámetro se debe devolver un HTTP Status 400 Bad Request.</li>
</ul>

 ## Producción
 <ol>
 <li><p><b>Analizador estático de código: </b>
 Se usa para este proceso a sonarcloud.io y se encuentra visibile en la siguiente url:
 https://sonarcloud.io/dashboard?id=mianguevara_DemoApp </p></li>
 
 <li><p><b>Pipeline CI/CD: </b>
 Se usa para este proceso a circleci y se encuentra en visible en la siguiente url:
 https://app.circleci.com/pipelines/github/mianguevara/DemoApp </p></li>
 
  <li><p><b>Despligue:</b>
 Para el proceso de despliegue se el cloud de amazon y se instancia un EC2 y se utiliza un S3 para el almacenamiento del .JAR, se puede visualizar en la siguiente dirección una vez la máquina se encuentre en ejecución:
   http://ec2-54-237-8-223.compute-1.amazonaws.com:8080/greeting?name=Michell </p></li>
</ol>

 


 
