import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class126 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1519 = new class126(0, 0, (String)null, -1, -1);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1529 = new class126(1, 1, (String)null, 0, 2);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1514 = new class126(2, 2, (String)null, 1, 2);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1525 = new class126(3, 3, (String)null, 2, 2);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1512 = new class126(4, 4, (String)null, 3, 1);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1517 = new class126(5, 5, (String)null, 4, 1);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1518 = new class126(6, 6, (String)null, 5, 1);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1513 = new class126(7, 7, (String)null, 6, 3);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1520 = new class126(8, 8, (String)null, 7, 3);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1524 = new class126(9, 9, (String)null, 8, 3);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1522 = new class126(10, 10, (String)null, 0, 7);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1523 = new class126(11, 11, (String)null, 1, 7);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1515 = new class126(12, 12, (String)null, 2, 7);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1528 = new class126(13, 13, (String)null, 3, 7);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1526 = new class126(14, 14, (String)null, 4, 7);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1532 = new class126(15, 15, (String)null, 5, 7);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   static final class126 field1527 = new class126(16, 16, (String)null, 0, 5);
   @ObfuscatedName("ao")
   @Export("fontHelvetica13")
   static java.awt.Font fontHelvetica13;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2084525283
   )
   final int field1521;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1661889385
   )
   final int field1530;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 241060171
   )
   final int field1531;

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;II)V",
      garbageValue = "-1"
   )
   class126(int var1, int var2, String var3, int var4, int var5) {
      this.field1521 = var1;
      this.field1530 = var2;
      this.field1531 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1530;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1737952549"
   )
   int method2907() {
      return this.field1531;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;I)V",
      garbageValue = "-1465265881"
   )
   public static void method2917(File var0) {
      FileSystem.FileSystem_cacheDir = var0;
      if (!FileSystem.FileSystem_cacheDir.exists()) {
         throw new RuntimeException("");
      } else {
         FileSystem.FileSystem_hasPermissions = true;
      }
   }

   @ObfuscatedName("ml")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-166821717"
   )
   static void method2911() {
      if (Client.field500 && class296.localPlayer != null) {
         int var0 = class296.localPlayer.pathX[0];
         int var1 = class296.localPlayer.pathY[0];
         if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         class31.oculusOrbFocalPointX = class296.localPlayer.x;
         int var2 = class132.getTileHeight(class296.localPlayer.x, class296.localPlayer.y, ApproximateRouteStrategy.Client_plane) - Client.camFollowHeight;
         if (var2 < VarpDefinition.field1869) {
            VarpDefinition.field1869 = var2;
         }

         PendingSpawn.oculusOrbFocalPointY = class296.localPlayer.y;
         Client.field500 = false;
      }

   }
}
