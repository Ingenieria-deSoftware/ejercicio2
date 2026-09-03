## Como realizar el ejercicio

### **Trabajo individual de cada integrante**

**Paso 1: Clonar el repositorio**

Cada miembro del equipo debe clonar el proyecto en su máquina:

```bash
git clone https://github.com/<usuario-creador>/ejercicio2.git
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

Cada Bloque debe tener este encabezado.

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

**Paso 6: Integrar en local y subir a `develop`**

El documento indica sincronizar con el modelo de ramas y subir `develop` al repositorio compartido. Para evitar sobreescrituras y conflictos desordenados, cada integrante debe seguir este orden:

1. **Cambiar a la rama `develop` local y actualizarla** con los últimos cambios del remoto:
    
    ```bash
    git checkout develop
    git pull origin develop
    ```
    
    (También se sugiere el uso de `git pull --rebase origin develop` para mantener un historial lineal).
    
1. **Fusionar tu rama feature dentro de `develop`**:
    
    ```bash
    git merge feature/porcentaje
    ```
    
    _(Si varios editaron el archivo `aritmetica` a la vez, Git marcará un conflicto. Deberán abrir el archivo, decidir cómo quedan combinadas las funciones, guardar, hacer `git add aritmetica` y confirmar el commit de merge)_.
    
1. **Subir `develop` actualizado a GitHub**:
    
    ```bash
    git push origin develop
    ```
    
2. _(Opcional / Buenas prácticas)_ Una vez integrada, puedes borrar la rama feature local:
    
    ```bash
    git branch -d feature/porcentaje
    ```
    
