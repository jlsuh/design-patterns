# Class Diagram

![image](https://user-images.githubusercontent.com/38252227/184269615-09c99734-209d-4a4c-8b34-8d9401e6caa8.png)

Existen implementaciones en donde la creación del objeto recién ocurre en `obtenerVivienda()`. Esto quiere decir que no
se tiene un atributo privado con el objeto producto en cuestión, sino que en `obtenerVivienda()` recién se crea un
objeto producto y se construye el objeto producto con los parámetros/atributos que se fueron cacheando en el Builder.