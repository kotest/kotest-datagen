package io.kotest.datagen

object BrandProducer : Producer<Brand> {
   private val brands = loadResourceAsLines("/brands.txt")
   override fun produce(): Brand {
      return Brand(brands.random())
   }
}

data class Brand(val value: String)