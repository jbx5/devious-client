import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public enum class134 implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1621(0, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1607(1, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1608(2, 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1609(3, 3),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1610(4, 4),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1617(5, 5),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1612(6, 6),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1611(7, 7),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   field1614(8, 8);

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Lle;"
   )
   static StudioGame field1606;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -2047759423
   )
   static int field1613;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1695238653
   )
   final int field1615;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1557384537
   )
   final int field1616;

   class134(int var3, int var4) {
      this.field1615 = var3;
      this.field1616 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1616;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "-116"
   )
   @Export("addChatMessage")
   static void addChatMessage(int var0, String var1, String var2, String var3) {
      ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
      if (var4 == null) {
         var4 = new ChatChannel();
         Messages.Messages_channels.put(var0, var4);
      }

      Message var5 = var4.addMessage(var0, var1, var2, var3);
      Messages.Messages_hashTable.put(var5, (long)var5.count);
      Messages.Messages_queue.add(var5);
      Client.chatCycle = Client.cycleCntr;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "328947468"
   )
   public static void method3124() {
      KitDefinition.KitDefinition_cached.clear();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZB)I",
      garbageValue = "-33"
   )
   static int method3126(int var0, Script var1, boolean var2) {
      if (var0 == 6754) {
         int var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         NPCComposition var6 = class137.getNpcDefinition(var5);
         Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
         return 1;
      } else {
         NPCComposition var3;
         if (var0 == 6764) {
            class302.Interpreter_intStackSize -= 2;
            var3 = class137.getNpcDefinition(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]);
            int var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.method3751(var4);
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.method3734(var4);
            return 1;
         } else if (var0 == 6765) {
            var3 = class137.getNpcDefinition(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }
}
