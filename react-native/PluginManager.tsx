import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

export const PluginManager = ({ plugins }: { plugins: string[] }) => (
    <View style={styles.container}>
        <Text style={styles.header}>Plugin Manager</Text>
        {plugins.map((plugin, idx) => (
            <Text style={styles.plugin} key={idx}>{plugin}</Text>
        ))}
    </View>
);

const styles = StyleSheet.create({
    container: { padding: 16 },
    header: { fontSize: 24, marginBottom: 10 },
    plugin: { fontSize: 18, padding: 8, backgroundColor: '#eee', marginVertical: 4 }
});

