import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class140 extends class136 {
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   @Export("worldSelectRightSprite")
   static IndexedSprite worldSelectRightSprite;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 786830149
   )
   int field1676;
   @ObfuscatedName("e")
   byte field1677;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class140(class139 var1) {
      this.this$0 = var1;
      this.field1676 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1676 = var1.readUnsignedShort();
      this.field1677 = var1.readByte();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3175(this.field1676, this.field1677);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1959996684"
   )
   static int method3105(int var0) {
      return class29.KeyHandler_keyCodes[var0];
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;I)V",
      garbageValue = "519981474"
   )
   public static void method3098(AbstractArchive var0) {
      class283.FloorUnderlayDefinition_archive = var0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "76"
   )
   static int method3104(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)Z",
      garbageValue = "-1039689208"
   )
   static final boolean method3095(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = ViewportMouse.ViewportMouse_y + var6;
      if (var7 < var0 && var7 < var1 && var7 < var2) {
         return false;
      } else {
         var7 = ViewportMouse.ViewportMouse_y - var6;
         if (var7 > var0 && var7 > var1 && var7 > var2) {
            return false;
         } else {
            var7 = ViewportMouse.ViewportMouse_x + var6;
            if (var7 < var3 && var7 < var4 && var7 < var5) {
               return false;
            } else {
               var7 = ViewportMouse.ViewportMouse_x - var6;
               return var7 <= var3 || var7 <= var4 || var7 <= var5;
            }
         }
      }
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1425199157"
   )
   static void updateGameState(int var0) {
      if (var0 != Client.gameState) {
         if (Client.gameState == 30) {
            Client.field572.method4068();
         }

         if (Client.gameState == 0) {
            BuddyRankComparator.client.method527();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            class37.method709(0);
            Client.field648 = 0;
            Client.field541 = 0;
            Client.timer.method7331(var0);
            if (var0 != 20) {
               InterfaceParent.method2251(false);
            }
         }

         if (var0 != 20 && var0 != 40 && class14.field83 != null) {
            class14.field83.close();
            class14.field83 = null;
         }

         if (Client.gameState == 25) {
            Client.field658 = 0;
            Client.field601 = 0;
            Client.field755 = 1;
            Client.field786 = 0;
            Client.field574 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var3 = Client.gameState == 11 ? 4 : 0;
               UserComparator5.method2830(ClanChannelMember.archive10, ClientPreferences.archive8, false, var3);
            } else if (var0 == 11) {
               UserComparator5.method2830(ClanChannelMember.archive10, ClientPreferences.archive8, false, 4);
            } else if (var0 == 50) {
               TaskHandler.setLoginResponseString("", "Updating date of birth...", "");
               UserComparator5.method2830(ClanChannelMember.archive10, ClientPreferences.archive8, false, 7);
            } else {
               FontName.method8199();
            }
         } else {
            boolean var1 = StructComposition.clientPreferences.method2424() >= Client.field511;
            int var2 = var1 ? 0 : 12;
            UserComparator5.method2830(ClanChannelMember.archive10, ClientPreferences.archive8, true, var2);
         }

         Client.gameState = var0;
      }
   }
}
