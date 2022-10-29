import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("EnumDefinition_archive")
   public static AbstractArchive EnumDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("EnumDefinition_cached")
   static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @Export("inputType")
   public char inputType;
   @ObfuscatedName("x")
   @Export("outputType")
   public char outputType;
   @ObfuscatedName("h")
   @Export("defaultStr")
   public String defaultStr = "null";
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 727291743
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1642297391
   )
   @Export("outputCount")
   public int outputCount = 0;
   @ObfuscatedName("d")
   @Export("keys")
   public int[] keys;
   @ObfuscatedName("n")
   @Export("intVals")
   public int[] intVals;
   @ObfuscatedName("r")
   @Export("strVals")
   public String[] strVals;

   EnumComposition() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "-2"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "-828068148"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.inputType = (char)var1.readUnsignedByte();
      } else if (var2 == 2) {
         this.outputType = (char)var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.defaultInt = var1.readInt();
      } else {
         int var3;
         if (var2 == 5) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.strVals = new String[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.strVals[var3] = var1.readStringCp1252NullTerminated();
            }
         } else if (var2 == 6) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.intVals = new int[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.intVals[var3] = var1.readInt();
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "64"
   )
   @Export("size")
   public int size() {
      return this.outputCount;
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      descriptor = "(Lcw;I)V",
      garbageValue = "-1074689727"
   )
   static final void method3528(PendingSpawn var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var0.type == 0) {
         var1 = class139.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 1) {
         var1 = class139.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 2) {
         var1 = class139.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 3) {
         var1 = class139.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (0L != var1) {
         int var6 = class139.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
         var3 = AttackOption.Entity_unpackID(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.objectId = var3;
      var0.field1126 = var4;
      var0.field1125 = var5;
   }
}
