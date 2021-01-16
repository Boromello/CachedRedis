# Sping Data JPA + Cache Redis
Sistema de cadastro de produtos e pedidos em um portal de e-commerce

## Justificativa de escolha e decisões técnicas
O Grupo optou por usar JPA e REDIS, pois não temos know how das ferramentas apresentadas em aula, 
fomos pela que mais nos identificamos.
Usando os exemplos feitos em LABS fizemos o projeto com as entidades pedidas no enunciado.


## Modelo UML
![Modelo de Relacionamento](https://i.ibb.co/brLHn8N/Modelo-UML.png)

## Configuração DB 
#### MySQL
database.properties
````Java
database.url=Inserir URL Database
database.username=Inserir Username
database.password=Inserir Password
````
#### Redis
redis.properties
````Java
redis.host=Inserir URL Host
redis.port=Inserir Porta
redis.password= Inserir Senha
````
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
#### Clientes
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
  "id": 1,
  "rua": "Rua Teste",
  "cidade": "Sao Paulo",
  "cep": "07435-655",
  "cliente": {
    "id": 1,
    "razaoSocial": "Coca-Cola",
    "enderecos": []
  }
}
````


**POST** - Adicionar endereço
````Java
http://localhost:8080/spring-app/entrega/endereco/
````
````javascript
// Body
{
  "id" : 0,
  "rua" : "Rua Teste19",
  "cidade" : "Sao Paulo",
  "cep" : "07435-655",
  "cliente" : {
    "id" : 1
  }
}
````

**UPDATE** - Atualizar endereço
````Java
http://localhost:8080/spring-app/entrega/endereco/
````
````javascript
// Body
{
  "id" : 2,
  "rua" : "Rua Teste19",
  "cidade" : "Sao Paulo",
  "cep" : "07435-655",
  "cliente" : {
    "id" : 1
  }
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
http://localhost:8080/spring-app/vendas/pedido/{id}
````
````javascript
// Response
{
    "id": 102,
    "dataPedido": 1610760538278,
    "cliente": {
        "id": 104,
        "razaoSocial": "Coca-Cola",
        "enderecos": []
    },
    "produtos": [
        {
            "id": 102,
            "nome": "Morango",
            "quantidade": 10,
            "valor": 1.0,
            "pedidos": []
        }
    ]
}
````


**POST** - Adicionar pedido
````Java
http://localhost:8080/spring-app/vendas/pedido
````
````javascript
// Body
{
    "id": 0,
    "dataPedido": 1610760538278,
    "cliente": {
        "id": 104,
        "razaoSocial": "Coca-Cola",
        "enderecos": []
    },
    "produtos": [
        {
            "id": 102
        }
    ]
}
````

**UPDATE** - Atualizar pedido
````Java
http://localhost:8080/spring-app/vendas/pedido
````
````javascript
// Body
{
    "id": 5,
    "dataPedido": 1610760538278,
    "cliente": {
        "id": 104,
        "razaoSocial": "Coca-Cola",
        "enderecos": []
    },
    "produtos": [
        {
            "id": 102
        }
    ]
}
````
**DELETE** - Deletar pedido
````Java
http://localhost:8080/spring-app/vendas/pedido/{id}
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
