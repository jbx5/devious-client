import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -455279703
   )
   @Export("type")
   int type;
   @ObfuscatedName("f")
   @Export("data")
   byte[] data;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lob;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive")
   Archive archive;

   ArchiveDiskAction() {
   }
}
