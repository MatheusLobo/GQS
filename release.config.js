module.exports = {
  branches: ['main'], // Branch monitorada
  plugins: [
    '@semantic-release/commit-analyzer',
    '@semantic-release/release-notes-generator',
    '@semantic-release/changelog',
    [
      '@semantic-release/npm',
      {
        npmPublish: true,
        pkgRoot: './dist',
        tarballDir: './dist',
      },
    ],
    '@semantic-release/git',
  ],
};
