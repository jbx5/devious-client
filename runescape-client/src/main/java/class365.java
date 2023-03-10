import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class365 {
   @ObfuscatedName("aj")
   @Export("cp1252AsciiExtension")
   static final char[] cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1239270328"
   )
   static int method6867() {
      return class28.KeyHandler_keyCodes.length;
   }
}
