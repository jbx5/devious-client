import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ka")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("WORLDMAPSECTIONTYPE0")
   WORLDMAPSECTIONTYPE0(0, (byte)0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("WORLDMAPSECTIONTYPE1")
   WORLDMAPSECTIONTYPE1(2, (byte)1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("WORLDMAPSECTIONTYPE2")
   WORLDMAPSECTIONTYPE2(3, (byte)2),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("WORLDMAPSECTIONTYPE3")
   WORLDMAPSECTIONTYPE3(1, (byte)3);

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Ltk;"
   )
   @Export("rasterProvider")
   public static AbstractRasterProvider rasterProvider;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -259244635
   )
   @Export("type")
   final int type;
   @ObfuscatedName("ap")
   @Export("id")
   final byte id;

   WorldMapSectionType(int var3, byte var4) {
      this.type = var3;
      this.id = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-38584803"
   )
   static void method5418() {
      if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
         Login.currentLoginField = 1;
      } else {
         Login.currentLoginField = 0;
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-521699324"
   )
   static int method5425(int var0, Script var1, boolean var2) {
      Widget var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.IF_GETOP) {
         if (var0 == ScriptOpcodes.IF_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1889537936"
   )
   @Export("playPcmPlayers")
   static final void playPcmPlayers() {
      if (class290.pcmPlayer1 != null) {
         class290.pcmPlayer1.run();
      }

      if (MouseRecorder.pcmPlayer0 != null) {
         MouseRecorder.pcmPlayer0.run();
      }

   }
}
