# Observer Pattern (OBSERVERPATTERN)

This module contains a small Observer Pattern example packaged as a Maven project.

Project layout:

- `src/main/java/observer` – Java sources (package `observer`)
- `src/test/java/observer` – JUnit tests
- `pom.xml` – Maven project file
- `build.sh` – convenience script (runs `mvn package`)
- `dist/` – build output (generated after running `./build.sh`)

Build & run
-----------

From the `OBSERVERPATTERN` directory:

```bash
./build.sh
```

This runs `mvn clean package` and puts compiled classes and the jar into `dist/`.

To run the example after building:

```bash
java -cp dist/observerpattern-1.0-SNAPSHOT.jar observer.Main
```

Run tests:

```bash
mvn test
```

Notes
-----
- Old compiled `.class` files and root-level duplicate `.java` files were removed from the repository root inside `OBSERVERPATTERN` to keep the project clean; sources now live under `src/main/java/observer`.
- The packaged jar does not declare a `Main-Class` in its manifest; use the `java -cp ... observer.Main` form above.
