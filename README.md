## Basic Scala Project

### Project structure

Each project has these files/folders (when using sbt).
- build.sbt: Defines the project configuration and library dependencies
- src/main/scala: This contains all the project files. It can have sub-folders.
- src/test/scala: This contains test files.

### Using `sbt`

To start `sbt`, just type `sbt` in the terminal from the "root" of your project
(where the build.sbt file is located).

- `compile`: Runs the compiler and reports errors.
- `run`: Runs the `def main` function in the scala project. All computation *must*
  start in `def main`.
- `~compile`: Add `~` to any command (`run` or `compile`) to make `sbt` automatically
  run it every time a file is saved inside `src/main/scala`.

### Language constructs

TODO(yoona): Add explanations for the following language constructs.

- **sealed trait**: TODO
- **case class**: TODO
- anything else
