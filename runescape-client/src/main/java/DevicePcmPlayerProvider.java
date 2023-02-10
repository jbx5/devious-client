import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class50 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("VarbitDefinition_archive")
   static AbstractArchive VarbitDefinition_archive;

   DevicePcmPlayerProvider() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Lak;",
      garbageValue = "7"
   )
   @Export("player")
   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;I)V",
      garbageValue = "1456896340"
   )
   public static void method324(AbstractArchive var0) {
      DbTableType.field4910 = var0;
   }
}
