import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("Task")
public class Task {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lff;"
   )
   @Export("next")
   Task next;
   @ObfuscatedName("s")
   @Export("status")
   public volatile int status = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1356039255
   )
   @Export("type")
   int type;
   @ObfuscatedName("j")
   @Export("intArgument")
   public int intArgument;
   @ObfuscatedName("i")
   @Export("objectArgument")
   Object objectArgument;
   @ObfuscatedName("n")
   @Export("result")
   public volatile Object result;

   Task() {
   }
}
