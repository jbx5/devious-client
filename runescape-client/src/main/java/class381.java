import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public final class class381 {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lhk;",
      garbageValue = "-2114828179"
   )
   @Export("getInvDefinition")
   public static InvDefinition getInvDefinition(int var0) {
      InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
         var1 = new InvDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         InvDefinition.InvDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      descriptor = "(Lde;B)V",
      garbageValue = "90"
   )
   static void method7122(NPC var0) {
      var0.field1155 = var0.definition.size;
      var0.field1220 = var0.definition.rotation;
      var0.walkSequence = var0.definition.walkSequence;
      var0.walkBackSequence = var0.definition.walkBackSequence;
      var0.walkLeftSequence = var0.definition.walkLeftSequence;
      var0.walkRightSequence = var0.definition.walkRightSequence;
      var0.idleSequence = var0.definition.idleSequence;
      var0.turnLeftSequence = var0.definition.turnLeftSequence;
      var0.turnRightSequence = var0.definition.turnRightSequence;
      var0.runSequence = var0.definition.field2014;
      var0.field1191 = var0.definition.field2011;
      var0.field1198 = var0.definition.field2012;
      var0.field1167 = var0.definition.field2013;
      var0.field1168 = var0.definition.field1994;
      var0.field1169 = var0.definition.field2015;
      var0.field1183 = var0.definition.field2016;
      var0.field1171 = var0.definition.field2017;
   }
}
