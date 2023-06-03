import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
final class class305 implements ThreadFactory {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("VarpDefinition_archive")
   public static AbstractArchive VarpDefinition_archive;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("SequenceDefinition_skeletonsArchive")
   static AbstractArchive SequenceDefinition_skeletonsArchive;
   @ObfuscatedName("ak")
   @Export("Tiles_underlays2")
   static byte[][][] Tiles_underlays2;
   @ObfuscatedName("eb")
   @Export("mouseCam")
   static boolean mouseCam;
   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive9")
   static Archive archive9;

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "([BIIB)Z",
      garbageValue = "-56"
   )
   static final boolean method5722(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label69:
      while(true) {
         int var6 = var4.readIncrSmallSmart();
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.readUShortSmart();
               if (var9 == 0) {
                  continue label69;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ObjectComposition var15 = class175.getObjectDefinition(var5);
                  if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
                     if (!var15.needsModelFiles()) {
                        ++Client.field574;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.readUShortSmart();
            if (var9 == 0) {
               break;
            }

            var4.readUnsignedByte();
         }
      }
   }
}
