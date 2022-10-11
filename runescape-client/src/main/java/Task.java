import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("Task")
public class Task {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lfy;"
   )
   @Export("next")
   Task next;
   @ObfuscatedName("x")
   @Export("status")
   public volatile int status = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1587015655
   )
   @Export("type")
   int type;
   @ObfuscatedName("j")
   @Export("intArgument")
   public int intArgument;
   @ObfuscatedName("y")
   @Export("objectArgument")
   Object objectArgument;
   @ObfuscatedName("d")
   @Export("result")
   public volatile Object result;

   Task() {
   }
}
