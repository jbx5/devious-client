import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
   @ObfuscatedName("ao")
   @Export("SpriteBuffer_spriteWidths")
   public static int[] SpriteBuffer_spriteWidths;
   @ObfuscatedName("ag")
   @Export("ByteArrayPool_arrays")
   public static byte[][][] ByteArrayPool_arrays;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1221428619
   )
   @Export("group")
   int group;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1118344763
   )
   @Export("type")
   int type;
   @ObfuscatedName("ac")
   boolean field1042 = false;

   InterfaceParent() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Lhb;",
      garbageValue = "1635329248"
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

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "102"
   )
   static void method2257() {
      int var0 = Players.Players_count;
      int[] var1 = Players.Players_indices;

      for(int var2 = 0; var2 < var0; ++var2) {
         if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
            class220.addPlayerToScene(Client.players[var1[var2]], true);
         }
      }

   }

   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      descriptor = "(Lmy;IIIIIII)V",
      garbageValue = "-1926672462"
   )
   static final void method2255(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Client.field560) {
         Client.alternativeScrollbarWidth = 32;
      } else {
         Client.alternativeScrollbarWidth = 0;
      }

      Client.field560 = false;
      int var7;
      if (MouseHandler.MouseHandler_currentButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.scrollY -= 4;
            class69.invalidateWidget(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.scrollY += 4;
            class69.invalidateWidget(var0);
         } else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if (var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.scrollY = var8 * (var4 - var3) / var9;
            class69.invalidateWidget(var0);
            Client.field560 = true;
         }
      }

      if (Client.mouseWheelRotation != 0) {
         var7 = var0.width;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.scrollY += Client.mouseWheelRotation * 45;
            class69.invalidateWidget(var0);
         }
      }

   }
}
