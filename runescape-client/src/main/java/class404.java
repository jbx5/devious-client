import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
public class class404 {
   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   @Export("fontPlain12")
   static Font fontPlain12;
   @ObfuscatedName("je")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("redHintArrowSprite")
   static SpritePixels redHintArrowSprite;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Ltx;",
      garbageValue = "1251019889"
   )
   public static PrivateChatMode method7633(int var0) {
      PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5155, PrivateChatMode.field5154, PrivateChatMode.field5153};
      PrivateChatMode[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         PrivateChatMode var4 = var2[var3];
         if (var0 == var4.field5156) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Lds;",
      garbageValue = "-1183866781"
   )
   static AttackOption[] method7634() {
      return new AttackOption[]{AttackOption.field1308, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1307, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden};
   }
}
