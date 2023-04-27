import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   public static final WorldMapCacheName field3054 = new WorldMapCacheName("details");
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   public static final WorldMapCacheName field3058 = new WorldMapCacheName("compositemap");
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   public static final WorldMapCacheName field3055 = new WorldMapCacheName("compositetexture");
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   static final WorldMapCacheName field3056 = new WorldMapCacheName("area");
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   public static final WorldMapCacheName field3053 = new WorldMapCacheName("labels");
   @ObfuscatedName("ab")
   @Export("name")
   public final String name;

   WorldMapCacheName(String var1) {
      this.name = var1;
   }
}
