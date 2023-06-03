import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("KitDefinition_archive")
   static AbstractArchive KitDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("KitDefinition_modelsArchive")
   static AbstractArchive KitDefinition_modelsArchive;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -466540867
   )
   @Export("KitDefinition_fileCount")
   public static int KitDefinition_fileCount;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("KitDefinition_cached")
   public static EvictingDualNodeHashTable KitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ti")
   @ObfuscatedSignature(
      descriptor = "Lbe;"
   )
   @Export("pcmStreamMixer")
   static PcmStreamMixer pcmStreamMixer;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1003257865
   )
   @Export("bodypartID")
   public int bodypartID = -1;
   @ObfuscatedName("ap")
   @Export("models2")
   int[] models2;
   @ObfuscatedName("ab")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("ak")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("ae")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("af")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("ao")
   @Export("models")
   int[] models = new int[]{-1, -1, -1, -1, -1};
   @ObfuscatedName("aa")
   @Export("nonSelectable")
   public boolean nonSelectable = false;

   KitDefinition() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "-25"
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "66"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.bodypartID = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.readUnsignedByte();
            this.models2 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.models2[var4] = var1.readUnsignedShort();
            }
         } else if (var2 == 3) {
            this.nonSelectable = true;
         } else if (var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.recolorFrom = new short[var3];
            this.recolorTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.recolorFrom[var4] = (short)var1.readUnsignedShort();
               this.recolorTo[var4] = (short)var1.readUnsignedShort();
            }
         } else if (var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.retextureFrom = new short[var3];
            this.retextureTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.retextureFrom[var4] = (short)var1.readUnsignedShort();
               this.retextureTo[var4] = (short)var1.readUnsignedShort();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.models[var2 - 60] = var1.readUnsignedShort();
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-16"
   )
   @Export("ready")
   public boolean ready() {
      if (this.models2 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.models2.length; ++var2) {
            if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Lit;",
      garbageValue = "1319978178"
   )
   @Export("getModelData")
   public ModelData getModelData() {
      if (this.models2 == null) {
         return null;
      } else {
         ModelData[] var1 = new ModelData[this.models2.length];

         for(int var2 = 0; var2 < this.models2.length; ++var2) {
            var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
         }

         ModelData var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new ModelData(var1, var1.length);
         }

         int var3;
         if (this.recolorFrom != null) {
            for(var3 = 0; var3 < this.recolorFrom.length; ++var3) {
               var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for(var3 = 0; var3 < this.retextureFrom.length; ++var3) {
               var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1299723731"
   )
   public boolean method3619() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)Lit;",
      garbageValue = "0"
   )
   @Export("getKitDefinitionModels")
   public ModelData getKitDefinitionModels() {
      ModelData[] var1 = new ModelData[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.models[var3] != -1) {
            var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
         }
      }

      ModelData var5 = new ModelData(var1, var2);
      int var4;
      if (this.recolorFrom != null) {
         for(var4 = 0; var4 < this.recolorFrom.length; ++var4) {
            var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
         }
      }

      if (this.retextureFrom != null) {
         for(var4 = 0; var4 < this.retextureFrom.length; ++var4) {
            var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
         }
      }

      return var5;
   }
}
