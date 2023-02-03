import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2090670973
   )
   @Export("type")
   int type;
   @ObfuscatedName("w")
   @Export("data")
   byte[] data;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive")
   Archive archive;

   ArchiveDiskAction() {
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Date;I)Z",
      garbageValue = "814020204"
   )
   static boolean method6455(Date var0) {
      Date var1 = StudioGame.method6442();
      return var0.after(var1);
   }
}
