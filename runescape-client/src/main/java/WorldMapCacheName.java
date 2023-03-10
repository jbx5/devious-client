import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lkg;"
   )
   public static final WorldMapCacheName field3019 = new WorldMapCacheName("details");
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkg;"
   )
   public static final WorldMapCacheName field3014 = new WorldMapCacheName("compositemap");
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkg;"
   )
   public static final WorldMapCacheName field3016 = new WorldMapCacheName("compositetexture");
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lkg;"
   )
   static final WorldMapCacheName field3013 = new WorldMapCacheName("area");
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkg;"
   )
   public static final WorldMapCacheName field3017 = new WorldMapCacheName("labels");
   @ObfuscatedName("sl")
   @ObfuscatedSignature(
      descriptor = "Lfi;"
   )
   @Export("guestClanSettings")
   static ClanSettings guestClanSettings;
   @ObfuscatedName("ao")
   @Export("name")
   public final String name;

   WorldMapCacheName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "295942057"
   )
   public static boolean method5296() {
      ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last();
      return var0 != null;
   }
}
