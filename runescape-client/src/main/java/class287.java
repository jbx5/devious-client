import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
public class class287 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3206 = new class287(2);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3197 = new class287(14);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3201 = new class287(6);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3199 = new class287(4);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3200 = new class287(16);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3202 = new class287(5);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3208 = new class287(5);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3203 = new class287(4);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3204 = new class287(7);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3205 = new class287(14);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   public static final class287 field3196 = new class287(11);

   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2"
   )
   class287(int var1) {
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      descriptor = "(Lha;IIII)V",
      garbageValue = "-1566363123"
   )
   static void method5696(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && class20.clientPreferences.method2465() != 0) {
         if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
            class161.method3447(var0.soundEffects[var1], var2, var3);
         }
      }
   }

   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-87"
   )
   @Export("createMenuAction")
   static void createMenuAction(int var0) {
      Language.tempMenuAction = new MenuAction();
      Language.tempMenuAction.param0 = Client.menuArguments1[var0];
      Language.tempMenuAction.param1 = Client.menuArguments2[var0];
      Language.tempMenuAction.opcode = Client.menuOpcodes[var0];
      Language.tempMenuAction.identifier = Client.menuIdentifiers[var0];
      Language.tempMenuAction.itemId = Client.menuItemIds[var0];
      Language.tempMenuAction.action = Client.menuActions[var0];
      Language.tempMenuAction.target = Client.menuTargets[var0];
   }

   @ObfuscatedName("mj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1669002823"
   )
   @Export("Widget_resetModelFrames")
   static final void Widget_resetModelFrames(int var0) {
      if (SoundSystem.loadInterface(var0)) {
         Widget[] var1 = VerticalAlignment.Widget_interfaceComponents[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if (var3 != null) {
               var3.modelFrame = 0;
               var3.modelFrameCycle = 0;
            }
         }

      }
   }
}
