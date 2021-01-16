# Sping Data JPA + Cache Redis
Sistema de cadastro de produtos e pedidos em um portal de e-commerce

## Endpoints
#### Produtos
**GET** - Buscar produto por Id
````Java
http://localhost:8080/spring-app/estoque/produto/{id}
````
````javascript
// Response
{
    "id": 1,
    "nome": "Morango",
    "quantidade": 10,
    "valor": 1.0,
    "pedidos": []
}
````


**POST** - Adicionar produto
````Java
http://localhost:8080/spring-app/estoque/produto
````
````javascript
// Body
{
    "nome": "Morango",
    "quantidade": 10,
    "valor": 1.0,
    "pedidos": []
}
````

**UPDATE** - Atualizar produto
````Java
http://localhost:8080/spring-app/estoque/produto
````
````javascript
// Body
{
    "id": 1,
    "nome": "Morango Update",
    "quantidade": 10,
    "valor": 1.0,
    "pedidos": []
}
````
**DELETE** - Deletar produto
````Java
http://localhost:8080/spring-app/estoque/produto/{id}
````
---------------------------------------
#### Cliente
**GET** - Buscar cliente por Id
````Java
http://localhost:8080/spring-app/usuario/cliente/{id}
````
````javascript
// Response
{
    "id": 52,
    "razaoSocial": "Coca-Cola",
    "enderecos": []
}
````


**POST** - Adicionar cliente
````Java
http://localhost:8080/spring-app/usuario/cliente
````
````javascript
// Body
{
    "razaoSocial": "Coca-Cola 3",
    "enderecos": []
}
````

**UPDATE** - Atualizar cliente
````Java
http://localhost:8080/spring-app/usuario/cliente
````
````javascript
// Body
{
    "id": 52
    "razaoSocial": "Coca-Cola 3",
    "enderecos": []
}
````
**DELETE** - Deletar cliente
````Java
http://localhost:8080/spring-app/usuario/cliente/{id}
````
---------------------------------------
#### Endereços
**GET** - Buscar endereço por Id
````Java
http://localhost:8080/spring-app/entrega/endereco/{id}
````
````javascript
// Response
{

}
````


**POST** - Adicionar endereço
````Java
http://localhost:8080/spring-app/entrega/endereco/
````
````javascript
// Body
{

}
````

**UPDATE** - Atualizar endereço
````Java
http://localhost:8080/spring-app/entrega/endereco/
````
````javascript
// Body
{

}
````
**DELETE** - Deletar endereço
````Java
http://localhost:8080/spring-app/entrega/endereco/{id}
````
---------------------------------------
#### Pedidos
**GET** - Buscar pedido por Id
````Java
http://localhost:8080/spring-app/entrega/endereco/{id}
````
````javascript
// Response
{

}
````


**POST** - Adicionar cliente
````Java
http://localhost:8080/spring-app/entrega/endereco/
````
````javascript
// Body
{

}
````

**UPDATE** - Atualizar produto
````Java
http://localhost:8080/spring-app/entrega/endereco/
````
````javascript
// Body
{

}
````
**DELETE** - Deletar produto
````Java
http://localhost:8080/spring-app/entrega/endereco/{id}
````
---------------------------------------

## Colaboradores
| Colaborador | Github |
| ------ | ------ |
| Fernando Gatti | [fernandodgatti][Gatti] |
| Henrique Abdala | [henriqueabdala][Abdala] |
| Iller Boromello | [boromello][Boromello] |

Professor Rafael Matsuyama

Licença
----
FIAP



[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>
   [Gatti]: <https://github.com/fernandodgatti>
   [Abdala]: <https://github.com/henriqueabdala>
   [Boromello]: <https://github.com/Boromello>
   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
