# Mehmet Client — Fabric 1.21.11 starter

This repository is a minimal Fabric mod skeleton for Minecraft Java Edition 1.21.11. GitHub Actions builds the JAR automatically. This initial version only logs that the mod loaded; it does not yet implement the GUI or the planned modules.

## Build the JAR with GitHub Actions

1. Create a new repository on GitHub.
2. Upload the contents of this folder to the repository (make sure `.github/workflows/build.yml` is included).
3. Open the repository's **Actions** tab.
4. Select **Build Mehmet Client JAR** and choose **Run workflow**, or push a commit to trigger a build.
5. Open the completed workflow run and download the artifact named `MehmetClient-...` from **Artifacts**.
6. Unzip the artifact. The mod JAR will be inside it. Put the JAR in the `mods` folder of a Fabric 1.21.11 installation that uses Java 21.

## Build locally (optional)

Install JDK 21, then run:

```bash
gradle --no-daemon clean build
```

The built JAR will be in `build/libs/`.

## Project settings

- Minecraft: 1.21.11
- Java: 21
- Fabric Loader: 0.18.4
- Fabric API: 0.141.1+1.21.11
- Fabric Loom: 1.14.1
- Mappings: Mojang official mappings

The project uses the official Fabric Loom remap plugin and Gradle 9.2.1 in CI. Version compatibility can change over time; if Fabric publishes a required dependency update, update the matching properties together.
