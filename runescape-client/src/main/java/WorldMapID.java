import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("WorldMapID")
public class WorldMapID {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   static final WorldMapID field2992 = new WorldMapID(0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   static final WorldMapID field2993 = new WorldMapID(1);
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 933607109
   )
   @Export("value")
   final int value;

   WorldMapID(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "(Lcf;I)V",
      garbageValue = "1547422490"
   )
   static void method5339(NPC var0) {
      var0.field1163 = var0.definition.size;
      var0.field1228 = var0.definition.rotation;
      var0.walkSequence = var0.definition.walkSequence;
      var0.walkBackSequence = var0.definition.walkBackSequence;
      var0.walkLeftSequence = var0.definition.walkLeftSequence;
      var0.walkRightSequence = var0.definition.walkRightSequence;
      var0.idleSequence = var0.definition.idleSequence;
      var0.turnLeftSequence = var0.definition.turnLeftSequence;
      var0.turnRightSequence = var0.definition.turnRightSequence;
      var0.runSequence = var0.definition.field2039;
      var0.field1173 = var0.definition.field2040;
      var0.field1174 = var0.definition.field2059;
      var0.field1168 = var0.definition.field2042;
      var0.field1187 = var0.definition.field2043;
      var0.field1172 = var0.definition.field2065;
      var0.field1178 = var0.definition.field2045;
      var0.field1179 = var0.definition.field2057;
   }
}
