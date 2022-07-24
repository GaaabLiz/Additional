import java.io.File

class ResCollocate {

    companion object {
        @JvmStatic fun main(args : Array<String>) {
            val generated  = File(System.getProperty("user.dir") + "//fabric//src//main//generated")
            val commonRes = File(System.getProperty("user.dir") + "//common//src//main//resources")
            val assetsAdt = File(System.getProperty("user.dir") + "//assets//adt")
            val commonRes_assets = File(System.getProperty("user.dir") + "//common//src//main//resources//assets")
            val commonRes_cache = File(System.getProperty("user.dir") + "//common//src//main//resources//.cache")
            val commonRes_assets_adt = File(System.getProperty("user.dir") + "//common//src//main//resources//assets//additional")
            println("Folder 'generated' = $generated")
            println("Folder 'commonRes' = $commonRes")
            println("commonRes = $commonRes")
            commonRes_assets.deleteRecursively()
            commonRes_cache.deleteRecursively()
            /*
            generated.listFiles().forEach { file ->
                println("generated file # -> ${file.name} | ${file.path}")
                file.copyRecursively(commonRes, false)
                //file.let { it.copyRecursively(commonRes, false); }
            }*/
            generated.copyRecursively(commonRes)
            assetsAdt.copyRecursively(commonRes_assets_adt)
        }
    }
}