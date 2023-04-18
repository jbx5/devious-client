import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("Task")
public class Task {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("next")
   Task next;
   @ObfuscatedName("ac")
   @Export("status")
   public volatile int status = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1725083443
   )
   @Export("type")
   int type;
   @ObfuscatedName("ab")
   @Export("intArgument")
   public int intArgument;
   @ObfuscatedName("aq")
   @Export("objectArgument")
   Object objectArgument;
   @ObfuscatedName("al")
   @Export("result")
   public volatile Object result;

   Task() {
   }
}
