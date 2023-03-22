import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("WORLDMAPSECTIONTYPE0")
   WORLDMAPSECTIONTYPE0(3, (byte)0),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("WORLDMAPSECTIONTYPE1")
   WORLDMAPSECTIONTYPE1(1, (byte)1),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("WORLDMAPSECTIONTYPE2")
   WORLDMAPSECTIONTYPE2(2, (byte)2),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("WORLDMAPSECTIONTYPE3")
   WORLDMAPSECTIONTYPE3(0, (byte)3);

   @ObfuscatedName("vi")
   @ObfuscatedSignature(
      descriptor = "Ldb;"
   )
   @Export("clientPreferences")
   static ClientPreferences clientPreferences;
   @ObfuscatedName("ue")
   @ObfuscatedGetter(
      intValue = -1812545536
   )
   static int field2937;
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   static Bounds field2932;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -425494983
   )
   @Export("type")
   final int type;
   @ObfuscatedName("ao")
   @Export("id")
   final byte id;

   WorldMapSectionType(int var3, byte var4) {
      this.type = var3;
      this.id = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Ljv;",
      garbageValue = "610537016"
   )
   static WorldMapSectionType[] method5187() {
      return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE2};
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IB)Led;",
      garbageValue = "-116"
   )
   static class129 method5191(int var0) {
      class129 var1 = (class129)SpriteMask.findEnumerated(class208.method4080(), var0);
      if (var1 == null) {
         var1 = class129.field1557;
      }

      return var1;
   }
}
