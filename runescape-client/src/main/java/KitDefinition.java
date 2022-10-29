import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("KitDefinition_archive")
   public static AbstractArchive KitDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("KitDefinition_modelsArchive")
   public static AbstractArchive KitDefinition_modelsArchive;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1502970673
   )
   @Export("KitDefinition_fileCount")
   public static int KitDefinition_fileCount;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("KitDefinition_cached")
   static EvictingDualNodeHashTable KitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 554779433
   )
   @Export("bodypartID")
   public int bodypartID = -1;
   @ObfuscatedName("j")
   @Export("models2")
   int[] models2;
   @ObfuscatedName("y")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("d")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("n")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("r")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("l")
   @Export("models")
   int[] models = new int[]{-1, -1, -1, -1, -1};
   @ObfuscatedName("s")
   @Export("nonSelectable")
   public boolean nonSelectable = false;

   KitDefinition() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1085321484"
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
      garbageValue = "432063123"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1930999558"
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Lgs;",
      garbageValue = "-67"
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-35"
   )
   public boolean method3470() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Lgs;",
      garbageValue = "-2134968834"
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2120379664"
   )
   public static void method3476() {
      try {
         if (class283.musicPlayerStatus == 1) {
            int var0 = class283.midiPcmStream.method5576();
            if (var0 > 0 && class283.midiPcmStream.isReady()) {
               var0 -= class19.pcmSampleLength;
               if (var0 < 0) {
                  var0 = 0;
               }

               class283.midiPcmStream.setPcmStreamVolume(var0);
               return;
            }

            class283.midiPcmStream.clear();
            class283.midiPcmStream.removeAll();
            if (DevicePcmPlayerProvider.musicTrackArchive != null) {
               class283.musicPlayerStatus = 2;
            } else {
               class283.musicPlayerStatus = 0;
            }

            class131.musicTrack = null;
            class371.soundCache = null;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class283.midiPcmStream.clear();
         class283.musicPlayerStatus = 0;
         class131.musicTrack = null;
         class371.soundCache = null;
         DevicePcmPlayerProvider.musicTrackArchive = null;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)V",
      garbageValue = "-125"
   )
   static final void method3475(String var0, int var1) {
      PacketBufferNode var2 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3074, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0) + 1);
      var2.packetBuffer.writeByteNeg(var1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var2);
   }
}
