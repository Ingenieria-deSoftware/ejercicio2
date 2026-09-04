## Como realizar el ejercicio

### **Trabajo individual de cada integrante**

**Paso 1: Clonar el repositorio**

Cada miembro del equipo debe clonar el proyecto en su máquina:

```bash
git clone https://github.com/Ingenieria-deSoftware/ejercicio2.git
cd ejercicio2
```

(Al estar `develop` por defecto, te posicionará directamente en ella. Puedes verificarlo con `git branch`).

**Paso 2: Crear la rama de la característica (_feature branch_)**

Siguiendo la convención indicada (`feature/nombreOperacion`), cada miembro crea su rama a partir de `develop` (por ejemplo: suma, resta, multiplicacion):

```bash
git checkout -b feature/porcentaje
```

**Paso 3: Implementar la función aritmética**

En la nueva rama, cada integrante edita el archivo llamado **`aritmetica.java`** y programa una operación aritmética:

Versión de java: **Java 21 LTS** (como `JDK 21.0.1`, `JDK 21.0.2`, etc.). Cualquiera de la familia **JDK 21 (LTS)** funcionará de manera idéntica para este ejercicio.

Ejemplo de una función en el archivo `aritmetica.java`

Todos deben hacer sus implementaciones debajo de `SECCION DE OPERACIONES ARITMÉTICAS` en el orden asignado: suma, resta, multiplicación, división, módulo, potencia, raíz, porcentaje, promedio, factorial.

Cada Bloque debe tener encabezado como en este ejemplo.

```java
/* 
* Función: Porcentaje
* Autor: Alex Saavedra
*/

public double porcentaje(double total, double porcentaje) { 
	return (total * porcentaje) / 100.0; 
}
```

**Paso 4: Confirmar los cambios localmente**

Guarda los cambios en tu rama local:

```bash
git add aritmetica
git commit -m "feat: implementada funcion porcentaje"
```

**Paso 5: Subir la rama feature a GitHub**

Publica tu rama en el repositorio remoto:

```bash
git push origin feature/porcentaje
```

### **Integración y Merge en `develop`**

**Paso 6: Integrar en local y subir a rama remota**

Para evitar sobreescrituras y conflictos desordenados, cada integrante debe seguir este orden:

1. **Cambiar a la rama `develop` local y actualizarla** con los últimos cambios del remoto:
    
    ```bash
    git checkout develop
    git pull origin develop
    ```
    
    (También se sugiere el uso de `git pull --rebase origin develop` para mantener un historial lineal).
    
2. **Volver a la rama `feature`** para hacer merge con `develop`
	
	```bash
	git checkout feature/porcentaje
	git merge develop
	```
	
	 _(Si varios editaron el archivo `aritmetica` a la vez, Git marcará un conflicto. Deberán abrir el archivo, decidir cómo quedan combinadas las funciones, guardar, hacer `git add aritmetica` y confirmar el commit de merge)_.
	
3. **Actualizar rama `feature` remota**.
	
	```bash
	git push origin feature/porcentaje
	```

Una vez integrada, puedes borrar la rama feature local:

```bash

git branch -d feature/porcentaje

```

  
**Paso 9: Ya que la feature ha sido finalizada haremos Pull Request en GitHub**

Para añadir una capa de seguridad. **No se haran el push a `develop`**. La rama estará protegida y no se podrá hacer push aunque lo intenten.

Omitiremos el paso **6** de **Ejercicio 2** y el paso **5** de **Recomendaciones** del pdf.

Para crear el **Pull Request**:

Vas a GitHub y como acabas de hacer un push te aparecerá directamente el boton verde **Compare & pull request**

Y si no aparecierá: Haz clic en la pestaña **Pull requests** $\rightarrow$ botón verde **New pull request**.


- **Configuración del par de ramas (Crucial):**
    
    - **Base:** La rama receptora (por ejemplo, `develop`).
        
    - **Compare:** La rama con el nuevo código (por ejemplo, `feature/porcentaje`).
        
- **Verificación de viabilidad:**
    
    - Si los conflictos ya se resolvieron en local, aparecerá la marca verde: **"Able to merge"**.
        
    - Si existen colisiones de líneas no resueltas, GitHub mostrará una advertencia indicando que no se puede fusionar automáticamente.
        
- **Contenido descriptivo:**
    
    - **Descripción Breve:** Qué hace la función, el nombre del autor y cómo se probó (mostrando en pantalla con println).

- **Confirmación:** Clic en el botón verde **Create pull request**.


### Resolución de conflictos

  

*Un conflicto no es un error de sistema; es Git pidiendo criterio humano para no sobreescribir código*.

  

Git detendrá la operación y mostrará:

  

```text

Auto-merging aritmetica.java

CONFLICT (content): Merge conflict in aritmetica.java

Automatic merge failed; fix conflicts and then commit the result.

  

```

  

**Muestra el archivo en el editor de código:**

Verán las marcas automáticas de colisión de Git:

```java

<<<<<<< HEAD (feature/suma)

/*

* Función: resta

* Autor: devA

*/

public static double resta(double a, double b) {

return a - b;

}

=======

/*

* Función: suma

* Autor: devB

*/

public static double suma(double a, double b) {

return a + b;

}

>>>>>>> develop

```

  

**Resuelven el código manualmente:**

  

En nuestro caso, conservaremos los cambios que hicimos y los cambios que hizo el compañero para esto,

borran los delimitadores (`<<<<<<<`, `=======`, `>>>>>>>`) y dejan ordenadas ambas funciones:

```java

/*

* Función: suma

* Autor: devB

*/

public static double suma(double a, double b) {

return a + b;

}

  

/*

* Función: resta

* Autor: devA

*/

public static double resta(double a, double b) {

return a - b;

}

```

  
  

**Verifican compilación (Java 21):**

```bash

javac aritmetica.java

```

  
  

**Consolidan y suben:**

  

```bash

git add aritmetica.java

git commit -m "fix(merge): resuelto conflicto integrando suma y resta"

git push origin feature/suma

```
