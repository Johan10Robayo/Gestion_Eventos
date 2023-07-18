# EventsManagerApp ![SpringBoot](http://img.shields.io/badge/-Spring-6DB33F?style=flat-square&logo=spring&logoColor=ffffff)

Este software permite tanto la administración como la gestion de eventos de las empresas

## Descripción
EventsManagerApp es un proyecto API web diseñado para proporcionar endpoints que permite a los usuarios acceder y consumir datos de diversos componentes del software encargados de las sigueintes funcionalidades:

* Resgistrar usuarios con diferentes roles (Empresa, cliente y administrador)
* Las empresas pueden crear diferentes recintos en los cuales se llevaran a cabo eventos específicos, teniendo en cuenta el número de secciones, número de sillas por cada sección y el tipo de silla (VIP o general)
* Las empresas pueden agendar la programación de eventos en sus recintos disponibles
* La empresas pueden definir descuentos de los tiquetes para la entrada de cada evento
* Las empresas pueden definir el precio de cada entrada a un evento específico
* El administrador puede editar información de todos el software
* Los clientes pueden reservar entradas a eventos específicos


#Tecnologías 
-Spring Boot 3.0.1, JPA, MYSQL 8.0, esquema de autenticación basada en Json Web Tokens (JWT)


## Estado (implementado mejoras)
