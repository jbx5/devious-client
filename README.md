###
This is a fork of Unethicalite that I'm looking to actively maintain since I think this would be a nice learning experience for me.

Come join my discord if you're looking to share knowledge and learn together!

https://discord.gg/5sh52G36GF

You can also support this project through Patreon:

https://www.patreon.com/DeviousClient

# Launcher

The client launcher can be downloaded here:

https://github.com/jbx5/devious-launcher/releases

# Devious Client
A non-compliant and open source fork of OpenOSRS and Unethicalite.
This client is slightly modified in order to be compatible with our api. Updates to OpenOSRS are directly synced with this fork.

**All existing OpenOSRS or RuneLite plugins ARE compatible with this client.**

## Features

### Extended RuneLite API
- RuneLite classes such as Actor, TileObject, Item, are extended with an Interactable api, which allow interaction with the
object (ex. ``NPC.interact("Attack")``)
- Mixins are customized and optimized for the api & client

### OpenOSRS extensions
- The external plugin manager now also supports private GitHub repositories.

### Definitions/Compositions
- Methods such as getName(), getActions(), etc. of Items, TileObjects and NPCs rely on retrieving their composition
from the client, which in some cases needs to be run on the client thread. 
We have modified the client in such a way that compositions get cached, so that client thread lookups are only needed
if the composition is not cached. This allows for stuff like Widget.isVisible() and TileObject.getName() to work off
client thread.

### Packets
- Our api exposes most of the available client packets, which can be used to for example directly send interactions
to the server. An example use case is stacking multiple npc dialogs in one tick ([Example](https://cdn.discordapp.com/attachments/793302998443884557/885509804846616586/zfJSpw7f98.mp4))
- These packets are very easy to use with our Packet api. (ex. ``ItemPackets.createFirstAction(widget, id, slot).send()``)

### Pathfinding
- The client has a pathfinding api which covers the majority of the map. All collision data is crowdsourced using the 
internal Regions plugin. The data can be accessed from our backend.
- Besides walking, Transports and Teleports are also supported.

### Automation
- The client has different methods of interaction: invokes, clicks, packets. Using the Interaction plugin, all sorts of
interaction settings can be customized.
- Our API has classes such as LoopedPlugin and TaskPlugin, for easy creation of automation plugins.

### Natural mouse
- The interaction api supports the NaturalMouse library. Can be toggled in the Interaction plugin.

### Game API
- We have a simplified game api that helps developers to retrieve things such as entities, inventories, widgets, etc. from the client.
  (ex. ``Inventory.getFirst("Coins")`` ``NPCs.getNearest("Goblin")`` ``Magic.cast("Wind strike")`` etc.)

### Minimal environment
- The client can also be built as a typical (unethical) third party client, meaning without all the RuneLite stuff such as plugins. 
- The minimal environment may be ideal for people who want to run (multiple) script(s) and preserve cpu/ram usage.
- Check out the discord to see how to build using the minimal environment.

<br> There's much more that this fork offers which simply can't be fit into this small readme.
