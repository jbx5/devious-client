import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("EnumDefinition_archive")
   static AbstractArchive EnumDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("EnumDefinition_cached")
   static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("av")
   @Export("inputType")
   public char inputType;
   @ObfuscatedName("as")
   @Export("outputType")
   public char outputType;
   @ObfuscatedName("ax")
   @Export("defaultStr")
   public String defaultStr = "null";
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1875143555
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1161331513
   )
   @Export("outputCount")
   public int outputCount = 0;
   @ObfuscatedName("ak")
   @Export("keys")
   public int[] keys;
   @ObfuscatedName("ae")
   @Export("intVals")
   public int[] intVals;
   @ObfuscatedName("af")
   @Export("strVals")
   public String[] strVals;

   EnumComposition() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "202008849"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "-725675570"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.inputType = (char)var1.readUnsignedByte();
      } else if (var2 == 2) {
         this.outputType = (char)var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.defaultInt = var1.readInt();
      } else {
         int var3;
         if (var2 == 5) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.strVals = new String[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.strVals[var3] = var1.readStringCp1252NullTerminated();
            }
         } else if (var2 == 6) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.intVals = new int[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.intVals[var3] = var1.readInt();
            }
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1826864459"
   )
   @Export("size")
   public int size() {
      return this.outputCount;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Llm;",
      garbageValue = "-2069090041"
   )
   public static PacketBufferNode method3666() {
      PacketBufferNode var0;
      if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
         var0 = new PacketBufferNode();
      } else {
         var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
      }

      var0.clientPacket = null;
      var0.clientPacketLength = 0;
      var0.packetBuffer = new PacketBuffer(5000);
      return var0;
   }
}
