import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -112889395
   )
   @Export("type")
   int type;
   @ObfuscatedName("an")
   @Export("data")
   public byte[] data;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   @Export("archiveDisk")
   public ArchiveDisk archiveDisk;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive")
   public Archive archive;

   ArchiveDiskAction() {
   }
}
