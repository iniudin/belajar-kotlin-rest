# Api Spec

## Register User

Requests :
- Method : POST
- Endpoint : `/api/register`
- Method :
    -  Content-Type: application/json
    -  Accept: application/json
- Body :
```json
{
    "name": "string",
    "phone": "string",
    "email": "string, unique",
    "password": "string,min=8 max=20"
}
```

Response :
```json
{
    "code": "number",
    "status": "string",
    "data": {
        "id": "long",
        "name": "string",
        "phone": "string",
        "email": "string, unique",
        "created_at": "date",
        "updated_at": "date"
    }
}
```

## Login User

Requests :
- Method : POST
- Endpoint : `/api/login`
- Method :
    -  Content-Type: application/json
    -  Accept: application/json
- Body :
```json
{
    "name": "string",
    "password": "string,min=8 max=20"
}
```

Response :
```json
{
    "code": "number",
    "status": "string",
    "data": {
        "id": "long",
        "name": "string",
        "phone": "string",
        "email": "string, unique",
        "created_at": "date",
        "updated_at": "date"
    }
}
```

## Update User

Requests :
- Method : PUT
- Endpoint : `/api/users/{id}`
- Method :
    -  Content-Type: application/json
    -  Accept: application/json
- Body :
```json
{
    "name": "string",
    "phone": "string",
    "email": "string, unique",
    "password": "string,min=8 max=20"
}
```

Response :
```json
{
    "code": "number",
    "status": "string",
    "data": {
        "id": "long",
        "name": "string",
        "phone": "string",
        "email": "string, unique",
        "created_at": "date",
        "updated_at": "date"
    }
}
```

## List User

Requests :
- Method : GET
- Endpoint : `/api/users`
- Method :
    -  Content-Type: application/json
    -  Accept: application/json
- Query Param :
    - size : number
    - page : number


Response :
```json
{
    "code": "number",
    "status": "string",
    "data": [
        {
            "id": "long",
            "name": "string",
            "phone": "string",
            "email": "string, unique",
            "created_at": "date",
            "updated_at": "date"
        },
        {
            "id": "long",
            "name": "string",
            "phone": "string",
            "email": "string, unique",
            "created_at": "date",
            "updated_at": "date"
        }
    ]
}
```


## Delete User

Requests :
- Method : DELETE
- Endpoint : `/api/users/{id}`
- Method :
    -  Content-Type: application/json
    -  Accept: application/json

Response :
```json
{
    "code": "number",
    "status": "string"
}
```
