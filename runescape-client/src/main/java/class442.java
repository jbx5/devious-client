import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
public class class442 implements class447 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lsn;"
   )
   public final class477 field4708;

   @ObfuscatedSignature(
      descriptor = "(Lsy;)V"
   )
   class442(class478 var1) {
      this.field4708 = var1;
   }

   @ObfuscatedSignature(
      descriptor = "(Lrx;)V"
   )
   public class442(class443 var1) {
      this(new class478(var1));
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-493898286"
   )
   public int method8187(int var1) {
      return this.field4708.vmethod8643(var1);
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-36"
   )
   @Export("addCancelMenuEntry")
   static void addCancelMenuEntry() {
      Player.method2340();
      Client.menuActions[0] = "Cancel";
      Client.menuTargets[0] = "";
      Client.menuOpcodes[0] = 1006;
      Client.menuShiftClick[0] = false;
      Client.menuOptionsCount = 1;
   }
}
