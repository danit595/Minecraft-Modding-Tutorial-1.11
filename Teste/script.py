"""
Docstring kekeriono.

Hello Hello
"""

import sys
import re
import os

# -*- coding: utf-8 -*-

modId = str(input('Enter your mod: '))
modId = modId.strip()
modNameJava = modId
modId = modId.replace(' ', '_')
modName = modId
modId = modId.lower()
user = str(input('Enter your pc user: '))
dirCommon = ('common/net/' + user + '/' + modId)
dirResourcesBlockstates = ('resources/assets/' + modId + '/blockstates')
dirResourcesLang = ('resources/assets/' + modId + '/lang')
dirResourcesModelsBlock = ('resources/assets/' + modId + '/models/block')
dirResourcesModelsItem = ('resources/assets/' + modId + '/models/item')
dirResourcesTexturesBlocks = ('resources/assets/' + modId + '/textures/blocks')
dirResourcesTexturesItems = ('resources/assets/' + modId + '/textures/items')
print('\nBuilding ... \n')


def createDir(name):
    """Create all directories needed."""
    if not os.path.exists(name):
        os.makedirs(name)
        return True
    else:
        return False


def successfull(dir):
    """Print all directories built."""
    print(dir + ' built!')


def createAllDirs():
    """Call all directories needed."""
    if(createDir(dirCommon)):
        successfull(dirCommon)
    if(createDir(dirResourcesBlockstates)):
        successfull(dirResourcesBlockstates)
    if(createDir(dirResourcesLang)):
        successfull(dirResourcesLang)
    if(createDir(dirResourcesModelsBlock)):
        successfull(dirResourcesModelsBlock)
    if(createDir(dirResourcesModelsItem)):
        successfull(dirResourcesModelsItem)
    if(createDir(dirResourcesTexturesBlocks)):
        successfull(dirResourcesTexturesBlocks)
    if(createDir(dirResourcesTexturesItems)):
        successfull(dirResourcesTexturesItems)
    return True


def createMainJava():
    """Make Main java file."""
    f = open(dirCommon + '/' + modName + '.java', 'w')
    f.write('package net.' + user + '.' + modId + '\n\n'
            '@Mod(modid = ' + modName + '.mod_id,'
            'name = ' + modName + '.mod_name,'
            'version = ' + modName + '.version,'
            'dependencies = ' + modName + '.dependencies)\n'
            'public class ' + modName + '{\n'
            '\tpublic static final String\n\t\t'
            'mod_id = "' + modId + '"\n\t\t'
            'mod_name = "' + modNameJava + '"\n\t\t'
            'version = "@VERSION@"\n\t\t'
            'dependencies = "required-after:forge@[13.19.1.2188,)"\n\t\t'
            'resource_prefix= mod_id.toLowerCase() + ":"\n\t\t'
            ';\n'
            '}'
            )
    f.close()


if(createAllDirs()):
    print('\nDirectories succefully created!')
createMainJava()
