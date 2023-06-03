import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("Task")
public class Task {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lgu;"
   )
   @Export("next")
   Task next;
   @ObfuscatedName("as")
   @Export("status")
   public volatile int status = 0;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -2065371807
   )
   @Export("type")
   int type;
   @ObfuscatedName("ap")
   @Export("intArgument")
   public int intArgument;
   @ObfuscatedName("ab")
   @Export("objectArgument")
   Object objectArgument;
   @ObfuscatedName("ak")
   @Export("result")
   public volatile Object result;

   Task() {
   }
}
