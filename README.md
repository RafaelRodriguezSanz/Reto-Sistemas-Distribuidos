# Tutorial

## Preconditions

1. Tener instalado Make
2. Tener instalado Java8
3. Tener instalado Docker

## Initialization

Para iniciar docker basta con ejecutar el comando:

```
make initialize
```

## Build

Para compilar el proyecto basta con ejecutar el comando:

```
make build
```

## Deploy

Para deployar el proyecto basta con ejecutar el comando:

```
make deploy
```

## Clean

Para **ELIMINAR** todo lo generado del proyecto **Y TODAS LAS IMÁGENES, CONTENEDORES, VOLÚMENES Y REDES** de docker basta con ejecutar el comando:

```
make clean
```

## Test

Para probarlo basta ejecutar algún comando por ejemplo:

```
http://localhost:8082/forward?url=http://server2-node:8083/forward?url=http://server1-node:8082/ping
```

o

```
http://localhost:8080/forward?url=http://server2-spring:8081/forward?url=http://server1-spring:8080/ping
```

## Troubleshooting

Puede ser que algunos de los comandos del make no funcionen. Depende de si se ejecutan en windows o en mac. En mac no deberían de funcionar todos. Se pueden ajustar para ese sistema operativo.

Puede ser que el `make inicialize` tampoco funcione, porque la carpeta de instalación de dockerDesktop no sea la por defecto o el sistema se encuentre en otro idioma que no sea español.
