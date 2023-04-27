import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public enum class85 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   field1065(0, -1),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   field1072(1, 1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   field1070(2, 7),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   field1064(3, 8),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   field1067(4, 9);

   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive2")
   static Archive archive2;
   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive4")
   static Archive archive4;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 358560065
   )
   final int field1066;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1331571979
   )
   final int field1069;

   class85(int var3, int var4) {
      this.field1066 = var3;
      this.field1069 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1069;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;I)V",
      garbageValue = "579263121"
   )
   public static void method2277(AbstractArchive var0) {
      StructComposition.StructDefinition_archive = var0;
   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-128"
   )
   static final void method2275(int var0, int var1) {
      if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
         if (Client.showMouseOverText) {
            int var2 = DynamicObject.method2142();
            String var3;
            if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
               var3 = "Use" + " " + Client.field496 + " " + "->";
            } else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
               var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
            } else {
               var3 = Friend.method7814(var2);
            }

            if (Client.menuOptionsCount > 2) {
               var3 = var3 + class383.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
            }

            class137.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
         }
      }
   }

   @ObfuscatedName("nq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1194378494"
   )
   static void method2276() {
      if (class132.field1585 != null) {
         Client.field781 = Client.cycle;
         class132.field1585.method6903();

         for(int var0 = 0; var0 < Client.players.length; ++var0) {
            if (Client.players[var0] != null) {
               class132.field1585.method6898(WorldMapData_0.baseX * 64 + (Client.players[var0].x >> 7), GameObject.baseY * 64 + (Client.players[var0].y >> 7));
            }
         }
      }

   }
}
