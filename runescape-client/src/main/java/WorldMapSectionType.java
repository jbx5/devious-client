import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ljb;"
   )
   @Export("WORLDMAPSECTIONTYPE0")
   WORLDMAPSECTIONTYPE0(1, (byte)0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljb;"
   )
   @Export("WORLDMAPSECTIONTYPE1")
   WORLDMAPSECTIONTYPE1(0, (byte)1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljb;"
   )
   @Export("WORLDMAPSECTIONTYPE2")
   WORLDMAPSECTIONTYPE2(3, (byte)2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ljb;"
   )
   @Export("WORLDMAPSECTIONTYPE3")
   WORLDMAPSECTIONTYPE3(2, (byte)3);

   @ObfuscatedName("tj")
   @ObfuscatedSignature(
      descriptor = "Lcc;"
   )
   @Export("decimator")
   static Decimator decimator;
   @ObfuscatedName("aj")
   @Export("formattedOperatingSystemName")
   public static String formattedOperatingSystemName;
   @ObfuscatedName("ds")
   static boolean field2983;
   @ObfuscatedName("ky")
   @ObfuscatedGetter(
      intValue = 1897923909
   )
   @Export("cameraPitch")
   static int cameraPitch;
   @ObfuscatedName("ow")
   @ObfuscatedGetter(
      intValue = 896780031
   )
   static int field2984;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1627349533
   )
   @Export("type")
   final int type;
   @ObfuscatedName("ab")
   @Export("id")
   final byte id;

   WorldMapSectionType(int var3, byte var4) {
      this.type = var3;
      this.id = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([BI)Ljava/lang/String;",
      garbageValue = "-1678329446"
   )
   public static String method5427(byte[] var0) {
      return class144.method3257(var0, 0, var0.length);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Z",
      garbageValue = "88944891"
   )
   @Export("isNumber")
   public static boolean isNumber(CharSequence var0) {
      return UrlRequester.method2840(var0, 10, true);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "-1200984421"
   )
   static char method5420(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)[Ljb;",
      garbageValue = "-1754346109"
   )
   static WorldMapSectionType[] method5421() {
      return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE0};
   }
}
