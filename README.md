# 💱 Conversor de Monedas

Este proyecto es una aplicación Java de consola que permite convertir entre distintas monedas utilizando la API de [ExchangeRate API](https://www.exchangerate-api.com/). Permite conversiones entre monedas predefinidas y otras personalizadas ingresadas por el usuario.

## 📌 Características

- Conversión entre:
  - 🇺🇸 Dólar ⇄ Peso Chileno
  - 🇺🇸 Dólar ⇄ Peso Argentino
  - 🇺🇸 Dólar ⇄ Sol Peruano
- Opción para convertir cualquier otra moneda ingresando sus códigos ISO.
- Uso de la API ExchangeRate para obtener tasas actualizadas.
- Lectura segura de la clave API desde archivo `config.properties`.

---

## 🛠️ Requisitos

- Java 17 o superior.
- IntelliJ IDEA (opcional, pero recomendado).
- Conexión a internet (para las consultas a la API).
- Una cuenta gratuita en [ExchangeRate API](https://www.exchangerate-api.com/) para obtener tu clave (`API_KEY`).

---

## ⚙️ Instalación

1. Clona este repositorio:

```bash
git clone https://github.com/santander73/conversordemonedas.git
cd conversordemonedas
```

2. Crea un archivo llamado `config.properties` en la raíz del proyecto con el siguiente contenido:

```properties
API_KEY=tu_api_key_aquí
```

> ⚠️ **Nunca compartas tu API Key ni la subas a GitHub.** Asegúrate de que `config.properties` esté en `.gitignore`.

3. Ejecuta el programa desde tu entorno favorito o con:

```bash
javac src/*.java
java -cp src Principal
```

---

## 📁 Estructura del Proyecto

```
├── config.properties        # No se sube a GitHub
├── src
│   ├── Principal.java       # Menú principal del programa
│   ├── ConsultarMoneda.java# Conexión con API externa
│   ├── ConvertirMoneda.java# Lógica de conversión
│   └── Monedas.java         # Modelo de datos con record
└── .gitignore               # Asegura exclusión de config.properties
```

---

## 🧪 Ejemplo de Uso

```
**********************
Gracias por usar este conversor de monedas

Ingresa la conversion que desees realizar

1. Dólar a Peso Chileno
2. Peso Chileno a Dólar
3. Dólar a Peso Argentino
4. Peso Argentino a Dólar
5. Dólar a Sol Peruano
6. Sol Peruano a Dólar
7. Convertir otra moneda
8. Salir
Selecciona una opción:
```

---

## 🔐 Seguridad

Este proyecto carga la API Key desde un archivo `config.properties`, el cual está **excluido del control de versiones**. Esto evita filtraciones accidentales en GitHub.

---

## ✍️ Autor

**José Luis Santander**  
GitHub: [@santander73](https://github.com/santander73)

---

## 📄 Licencia

Este proyecto se distribuye bajo la licencia [MIT](LICENSE).
