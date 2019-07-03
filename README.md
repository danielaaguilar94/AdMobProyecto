# AdMobProyecto

Esta app consiste en un banner Admob para anuncios de prueba, y que para su visualización, se necesita configurar en el archivo de androidmanifest.xml establecer
el permiso de INTERNET.
Especificar un metadata en el archivo manifest para agregar un nombre y un valor
También es necesario agregar una dependencia google play services ads en el archivo de configuración del modulo de la app de graddle.
Se prosigue a diseñar un componente Adview que tiene varias adSize el el cual se define el tamaño de anuncio y el adUnitId que es un
identificador único asignado al bloque de anuncios. 
se inicializa el modo de MobileAds en el activity pasando los parámetros que pide como el contexto y un id de bloque, en este caso
de un bloque de anunncios para banner,y se carga el componente Adview ya referenciado en el Activity 
mediante un request(que obtiene los datos sobre el tiempo en ejecucion)  y agregar un dispositivo de prueba addTestDevice 
con el id del dispositivo para el cual se hará la prueba, como lo es el Emulador de prueba genymotion en Android.
