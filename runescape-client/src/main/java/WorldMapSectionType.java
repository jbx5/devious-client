import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("WORLDMAPSECTIONTYPE0")
   WORLDMAPSECTIONTYPE0(2, (byte)0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("WORLDMAPSECTIONTYPE1")
   WORLDMAPSECTIONTYPE1(3, (byte)1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("WORLDMAPSECTIONTYPE2")
   WORLDMAPSECTIONTYPE2(0, (byte)2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("WORLDMAPSECTIONTYPE3")
   WORLDMAPSECTIONTYPE3(1, (byte)3);

   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1816718813
   )
   @Export("type")
   final int type;
   @ObfuscatedName("q")
   @Export("id")
   final byte id;

   WorldMapSectionType(int var3, byte var4) {
      this.type = var3;
      this.id = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;I)V",
      garbageValue = "-414015759"
   )
   public static void method5233(AbstractArchive var0, AbstractArchive var1) {
      SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
      SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "934969929"
   )
   public static void method5237() {
      try {
         File var0 = new File(UserComparator3.userHomeDirectory, "random.dat");
         int var2;
         if (var0.exists()) {
            JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
         } else {
            label38:
            for(int var1 = 0; var1 < class89.cacheSubPaths.length; ++var1) {
               for(var2 = 0; var2 < class121.cacheParentPaths.length; ++var2) {
                  File var3 = new File(class121.cacheParentPaths[var2] + class89.cacheSubPaths[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
                     break label38;
                  }
               }
            }
         }

         if (JagexCache.JagexCache_randomDat == null) {
            RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
            var2 = var4.read();
            var4.seek(0L);
            var4.write(var2);
            var4.seek(0L);
            var4.close();
            JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1437663571"
   )
   static final int method5234(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-632900931"
   )
   static void method5230() {
      Client.menuOptionsCount = 0;
      Client.isMenuOpen = false;
   }

   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1176729619"
   )
   static final void method5236() {
      PacketBufferNode var0 = class136.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
      Client.packetWriter.addNode(var0);
      Interpreter.field868 = true;

      for(InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
         if (var1.type == 0 || var1.type == 3) {
            class9.closeInterface(var1, true);
         }
      }

      if (Client.meslayerContinueWidget != null) {
         class69.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      Interpreter.field868 = false;
   }
}
